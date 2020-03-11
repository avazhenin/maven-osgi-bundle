package org.home.examples;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

    public static Logger LOG = LoggerFactory.getLogger(Activator.class);

    public void start(BundleContext context) throws Exception {
        System.out.println("Starting bundle");
        LOG.trace("Starting before pax-logging-api");
        LOG.debug("Starting before pax-logging-api");
        LOG.info("Starting before pax-logging-api");
        LOG.warn("Starting before pax-logging-api");
    }


    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping bundle");
        LOG.trace("Stopping after pax-logging-api");
        LOG.debug("Stopping after pax-logging-api");
        LOG.info("Stopping after pax-logging-api");
        LOG.warn("Stopping after pax-logging-api");
    }
}
