package io.micronaut.security.oauth2.docs.openid;

//tag::clazz[]
import io.micronaut.core.annotation.Nullable;
import io.micronaut.security.authentication.AuthenticationResponse;
import io.micronaut.security.authentication.UserDetails;
import io.micronaut.security.oauth2.endpoint.authorization.state.State;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdClaims;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdTokenResponse;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdUserDetailsMapper;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.util.Collections;

@Singleton
@Named("okta") // <1>
public class OktaUserDetailsMapper implements OpenIdUserDetailsMapper {
    
    @Override
    @NonNull
    public AuthenticationResponse createAuthenticationResponse(String providerName, // <2>
                                                               OpenIdTokenResponse tokenResponse, // <3>
                                                               OpenIdClaims openIdClaims, // <4>
                                                               @Nullable State state) { // <5>
        return new UserDetails("name", Collections.emptyList()); // <6>
    }


}
//end::clazz[]