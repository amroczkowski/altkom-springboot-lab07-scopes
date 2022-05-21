package pl.altkom.springboot.lab07.scopes.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class PrototypeScopeService {
}
