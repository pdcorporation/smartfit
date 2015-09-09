package br.com.smartfit.web.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterView extends Composite {

  private static FooterViewUiBinder uiBinder = GWT.create(FooterViewUiBinder.class);

  interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
  }

  public FooterView() {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
