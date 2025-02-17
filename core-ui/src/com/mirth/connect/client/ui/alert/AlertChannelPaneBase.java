/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.client.ui.alert;

import javax.swing.JPanel;

import com.mirth.connect.model.alert.AlertChannels;

@SuppressWarnings("serial")
public abstract class AlertChannelPaneBase extends JPanel {

	public AlertChannels getChannels() {
		return null;
	}

	public abstract void setChannels(AlertChannels alertChannels, boolean includeConnectors);

}
