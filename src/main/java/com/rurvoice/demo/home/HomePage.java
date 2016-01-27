package com.rurvoice.demo.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.rurvoice.layout.LayoutPanelPage;
import com.rurvoice.layout.example.LayoutExamplePage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here

		add(new Label("helloWorld", "Hello World!"));

		add(new Link("linkToAnotherPage") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(AnotherPage.class);
			}
		});

		add(new Link("layoutPanelPage") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(LayoutPanelPage.class);
			}
		});
		
		add(new Link("layoutExamplePage") {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(LayoutExamplePage.class);
			}
		});
		
	}
}
