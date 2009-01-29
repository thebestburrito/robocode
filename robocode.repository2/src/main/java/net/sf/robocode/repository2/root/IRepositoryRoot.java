/*******************************************************************************
 * Copyright (c) 2001, 2009 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package net.sf.robocode.repository2.root;


import net.sf.robocode.repository2.items.IItem;

import java.net.URL;
import java.util.Dictionary;
import java.io.InputStream;


/**
 * @author Pavel Savara (original)
 */
public interface IRepositoryRoot {
	void update();
	void update(IItem item, boolean force);
	boolean isChanged(IItem item);
	URL getRootUrl();
	URL getClassPathUrl();
	boolean isPackage();
	boolean isDevel();
}