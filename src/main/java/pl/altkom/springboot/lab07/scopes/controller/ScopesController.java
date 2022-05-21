package pl.altkom.springboot.lab07.scopes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab07.scopes.service.ScopesService;

@RequiredArgsConstructor
@RequestMapping("/scope")
@RestController
public class ScopesController {

    private final ScopesService scopesService;

    @GetMapping("/singleton")
    public String singletonScope() {
        return scopesService.singletonScope();
    }

    @GetMapping("/prototype")
    public String prototypeScope() {
        return scopesService.prototypeScope();
    }

    @GetMapping("/request")
    public String requestScope() {
        return scopesService.requestScope();
    }

//    @GetMapping("/session")
//    public String sessionScope() {
//        return scopesService.sessionScope();
//    }
//
//    @GetMapping("/application")
//    public String applicationScope() {
//        return scopesService.applicationScope();
//    }
//
//    @GetMapping("/websocket")
//    public String websocketScope() {
//        return scopesService.websocketScope();
//    }
}
