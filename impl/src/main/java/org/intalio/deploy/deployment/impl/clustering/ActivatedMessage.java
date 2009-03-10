package org.intalio.deploy.deployment.impl.clustering;

import java.io.Serializable;

import org.intalio.deploy.deployment.DeployedAssembly;

public class ActivatedMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public DeployedAssembly assembly;

    public ActivatedMessage(DeployedAssembly assembly) {
        this.assembly = assembly;
    }
}