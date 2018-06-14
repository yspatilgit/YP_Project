package eventLibraryFramework;

public interface BrowserMethods {

	public void user_launches_browser(String strArg1, String strArg2) throws Throwable;
	public void user_enters_something_text_in_textbox_something(String strArg1, String strArg2) throws Throwable;
	public void user_selects_something_from_dropdown_something(String strArg1, String strArg2) throws Throwable;	
	public void user_selects_something_radio_button_something(String strArg1, String strArg2) throws Throwable;
    public void user_check_something_checkbox_something(String strArg1, String strArg2) throws Throwable;
    public void user_click_something_button(String strArg1) throws Throwable;
    public void user_click_something_link(String strArg1) throws Throwable;
    public void user_click_something_image_link(String strArg1) throws Throwable;
    public void user_launch_page_successfully() throws Throwable;
    public void user_enters_text_something_and_something_for_something(String strArg1, String strArg2, String strArg3) throws Throwable;
  
}
