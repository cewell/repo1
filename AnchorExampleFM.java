package us.nd.state.itd.apps.itd.itdappfunction.training.web.example;

import us.nd.state.itd.apps.itd.itdappfunction.training.web.ITDAppFM;

public final class AnchorExampleFM extends ITDAppFM {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName = "";
    private String lastName = "";

	private String anchorLocation;
    private String message = "";

    /**
     * @return Returns the firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            The firstName to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Returns the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            The lastName to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
    
    public String getAnchorLocation(){
        return anchorLocation;
    }  
    
    public void setAnchorLocation(String anchorLocation){
        this.anchorLocation = anchorLocation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}