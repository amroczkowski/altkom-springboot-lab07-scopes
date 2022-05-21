package pl.altkom.springboot.lab07.scopes.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ScopesService {

    private final Scope2Service scope2Service;

    private final SingletonScopeService singletonScopeService;
    private final PrototypeScopeService prototypeScopeService;
    private final RequestScopeService requestScopeService;

    public String singletonScope() {
        return String.format("Bean1: %s, Bean2: %s", singletonScopeService.toString(), scope2Service.singletonScope());
    }

    public String prototypeScope() {
        return String.format("Bean1: %s, Bean2: %s", prototypeScopeService.toString(), scope2Service.prototypeScope());
    }

    public String requestScope() {
        return String.format("Bean1: %s, Bean2: %s", requestScopeService.toString(), scope2Service.requestScope());
    }
}
