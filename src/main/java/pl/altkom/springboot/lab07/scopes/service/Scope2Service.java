package pl.altkom.springboot.lab07.scopes.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class Scope2Service {

    private final SingletonScopeService singletonScopeService;
    private final PrototypeScopeService prototypeScopeService;
    private final RequestScopeService requestScopeService;

    public String singletonScope() {
        return singletonScopeService.toString();
    }

    public String prototypeScope() {
        return prototypeScopeService.toString();
    }

    public String requestScope() {
        return requestScopeService.toString();
    }
}
