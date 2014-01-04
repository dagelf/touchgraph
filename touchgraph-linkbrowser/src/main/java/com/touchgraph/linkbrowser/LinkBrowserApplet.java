/*
 * TouchGraph LLC. Apache-Style Software License
 *
 *
 * Copyright (c) 2002 Alexander Shapiro. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by 
 *        TouchGraph LLC (http://www.touchgraph.com/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "TouchGraph" or "TouchGraph LLC" must not be used to endorse 
 *    or promote products derived from this software without prior written 
 *    permission.  For written permission, please contact 
 *    alex@touchgraph.com
 *
 * 5. Products derived from this software may not be called "TouchGraph",
 *    nor may "TouchGraph" appear in their name, without prior written
 *    permission of alex@touchgraph.com.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL TOUCHGRAPH OR ITS CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR 
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * ====================================================================
 *
 */

/**  This code is being released under the "release early, release often" open source mantra. 
  *  
  *  It is very dirty, and is intended for only the most determined hacker that wants to 
  *  make a minor alteration here and there.
  *
  *  You are strongly advised to wait for a major rewrite that will occur following the 
  *  restructuring of the TG Graph Layout code.   
  *
  *  @author   Alexander Shapiro                                        
  *  @version  1.20
  */
  
package com.touchgraph.linkbrowser;

import java.awt.BorderLayout;

import javax.swing.JApplet;

public class LinkBrowserApplet extends JApplet {
	public String getAppletInfo()
    {
        String s = "";
		s += "*******************************************************************\n";
		s += "*   TouchGraph Link Browser                                       *\n"; 
		s += "*   (c) 2001                                                      *\n";
		s += "*   Author: Alexander Shapiro         Email: alex@touchgraph.com  *\n";
		s += "*******************************************************************\n";
        return s;
    }
	private TGLinkBrowser tgLinkBrowser;
	
    public void init() {
    	System.out.println(getAppletInfo());
        getContentPane().setLayout(new BorderLayout());
        setSize(500,500);
		tgLinkBrowser = new TGLinkBrowser(this);
        getContentPane().add(tgLinkBrowser, BorderLayout.CENTER);
    }

	public void setLocale(String nodeName) {
		tgLinkBrowser.setLocale(nodeName,2);	
	}
}	

