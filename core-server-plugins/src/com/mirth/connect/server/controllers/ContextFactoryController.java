/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.server.controllers;

import java.net.URL;
import java.util.List;
import java.util.Set;

import org.mozilla.javascript.ContextFactory;

import com.mirth.connect.model.LibraryProperties;

public abstract class ContextFactoryController extends Controller {

    public abstract void initGlobalContextFactory();

    public abstract void updateResources(List<LibraryProperties> resources, boolean startup) throws Exception;

    public abstract ContextFactory getGlobalContextFactory();

    public abstract ContextFactory getGlobalScriptContextFactory() throws Exception;

    public abstract ContextFactory getContextFactory(Set<String> libraryResourceIds) throws Exception;
    
    public abstract ContextFactory getDebugContextFactory(Set<String> libraryResourceIds, String channelId, String scriptId) throws Exception;
    
    public abstract void removeDebugContextFactory(Set<String> libraryResourceIds, String channelId, String scriptId);

    public abstract void reloadResource(String resourceId) throws Exception;

    public abstract List<URL> getLibraries(String resourceId) throws Exception;
    
    public abstract void setExtensionController(ExtensionController extensionController);

    public abstract ExtensionController getExtensionController();
}