/*
* Copyright (c) 2010-2012 Research In Motion Limited. All rights reserved.
*
* This program and the accompanying materials are made available
* under the terms of the Eclipse Public License, Version 1.0,
* which accompanies this distribution and is available at
*
* http://www.eclipse.org/legal/epl-v10.html
*
*/
package net.rim.ejde.internal.propertytester;

import net.rim.ide.OSUtils;

import org.eclipse.core.expressions.PropertyTester;

/**
 * Test if the current platform is Windows.
 *
 * @author dmeng
 *
 */
public class PlatformPropertyTester extends PropertyTester {

    @Override
    public boolean test( Object receiver, String property, Object[] args, Object expectedValue ) {
        return OSUtils.isWindows();
    }
}
