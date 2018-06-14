package StepLibraryFramework;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import eventLibraryFramework.BrowserSession;

public class StepDefinition extends BrowserSession{
	
	@Given("^user launches browser \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_launches_browser(String strArg1, String strArg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BrowserSession.class.newInstance().user_launches_browser(strArg1,strArg2);
	}
	
	@And("^user enters \"([^\"]*)\" text in textbox \"([^\"]*)\"$")
    public void user_enters_something_text_in_textbox_something(String strArg1, String strArg2) throws Throwable {
		BrowserSession.class.newInstance().user_enters_something_text_in_textbox_something(strArg1, strArg2);
    }

    @And("^user selects \"([^\"]*)\" from dropdown \"([^\"]*)\"$")
    public void user_selects_something_from_dropdown_something(String strArg1, String strArg2) throws Throwable {
        
    }

    @And("^user selects \"([^\"]*)\" radio button \"([^\"]*)\"$")
    public void user_selects_something_radio_button_something(String strArg1, String strArg2) throws Throwable {
        
    }

    @And("^user check \"([^\"]*)\" checkbox \"([^\"]*)\"$")
    public void user_check_something_checkbox_something(String strArg1, String strArg2) throws Throwable {
        
    }

    @And("^user click \"([^\"]*)\" button$")
    public void user_click_something_button(String strArg1) throws Throwable {
    	BrowserSession.class.newInstance().user_click_something_button(strArg1);
    }

    @And("^user click \"([^\"]*)\" link$")
    public void user_click_something_link(String strArg1) throws Throwable {
        
    }

    @And("^user click \"([^\"]*)\" image link$")
    public void user_click_something_image_link(String strArg1) throws Throwable {
        
    }

    @And("^user launch page successfully$")
    public void user_launch_page_successfully() throws Throwable {
        
    }

    @And("^user enters text \"([^\"]*)\" and \"([^\"]*)\" for \"([^\"]*)\"$")
    public void user_enters_text_something_and_something_for_something(String strArg1, String strArg2, String strArg3) throws Throwable {
        
    }

    
}

