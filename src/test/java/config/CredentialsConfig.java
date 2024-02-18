package config;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/stage.properties")
public interface CredentialsConfig extends Config {

    @DefaultValue("DEFAULT")
    String user();
    @DefaultValue("DEFAULT_PASSWORD")

    String password();

}
