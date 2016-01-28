package com.rurvoice.layout;

import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ChildPage extends LayoutPanelPage {

	public ChildPage(PageParameters pageParameters) {
		super(pageParameters);
		add(new Label("dateTime", new Date()));
	}

}
