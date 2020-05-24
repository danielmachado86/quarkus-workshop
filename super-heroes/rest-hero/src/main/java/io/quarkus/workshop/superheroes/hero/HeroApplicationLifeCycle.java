package io.quarkus.workshop.superheroes.hero;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;

@ApplicationScoped
public class HeroApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info(" _   _ ___________ _____    ___ ______ _____");
        LOGGER.info("| | | |  ___| ___ \\  _  |  / _ \\| ___ \\_   _|");
        LOGGER.info("| |_| | |__ | |_/ / | | | / /_\\ \\ |_/ / | | ");  
        LOGGER.info("|  _  |  __||    /| | | | |  _  |  __/  | | ");  
        LOGGER.info("| | | | |___| |\\ \\\\ \\_/ / | | | | |    _| | "); 
        LOGGER.info("\\_| |_|____/\\_| \\_|\\___/  \\_| |_|_|    \\___/"); 
        LOGGER.infof("The application HERO is starting with profile '%s'", ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application Hero is stopping...");
    }
    
    
}