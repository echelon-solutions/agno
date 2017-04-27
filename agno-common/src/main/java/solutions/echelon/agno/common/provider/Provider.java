package solutions.echelon.agno.common.provider;

/**
 * An infrastructure resource. Can be deployed/undeployed.
 */
public interface Provider
{
    public void deploy();
    public void undeploy();
}
