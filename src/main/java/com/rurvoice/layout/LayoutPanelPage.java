package com.rurvoice.layout;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class LayoutPanelPage extends WebPage{
	
	public LayoutPanelPage(final PageParameters pageParameters) {
		MyHeadPanel myHeadPanel = new MyHeadPanel ("myHeadPanel");
		MyFootPanel myFootPanel = new MyFootPanel ("myFootPanel");
		MyMenuPanel myMenuPanel = new MyMenuPanel ("myMenuPanel");
		
		add(myHeadPanel);
		add(myFootPanel);
		add(myMenuPanel);
	}

}
