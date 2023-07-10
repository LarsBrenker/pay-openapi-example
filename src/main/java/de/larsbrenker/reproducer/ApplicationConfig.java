/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Application;

@ApplicationScoped
@jakarta.ws.rs.ApplicationPath("/")
@OpenAPIDefinition(info = @Info(
        title = "Payara Micro Reproducer with Eclipse MicroProfile 6.0",
        description = "Payara Micro Reproducer with Eclipse MicroProfile 6.0",
        version = "1.0-SNAPSHOT"
)
)
public class ApplicationConfig extends Application {

}
