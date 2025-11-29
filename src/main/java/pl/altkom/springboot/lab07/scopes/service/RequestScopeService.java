package pl.altkom.springboot.lab07.scopes.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
@Service
public class RequestScopeService {
}
