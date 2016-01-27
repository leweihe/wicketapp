package com.rurvoice.demo.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class AnotherPage extends WebPage {

	public AnotherPage(final PageParameters pageParameters) {
		super(pageParameters);
		add(new Link("linkToHomePage") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(HomePage.class);
			}
		});
	}

}
