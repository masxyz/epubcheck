/*
 * Copyright (c) 2011 Adobe Systems Incorporated
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of
 *  this software and associated documentation files (the "Software"), to deal in
 *  the Software without restriction, including without limitation the rights to
 *  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 *  the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.adobe.epubcheck.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.adobe.epubcheck.messages.MessageId;

public class Epub30CheckExpandedTest extends AbstractEpubCheckTest
{


  public Epub30CheckExpandedTest()
  {
    super("/30/expanded/");
  }

  @Test
  public void testValidateEPUBPLoremBasic()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-basic", expectedErrors, expectedWarnings, "valid/lorem-basic.txt");
  }

  @Test
  public void testValidateEPUBPLoremMultipleRenditions()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-xrenditions", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremMultipleRenditionsUnmanifested()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.OPF_003);
    testValidateDocument("invalid/lorem-xrenditions-unmanifested", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBWastelandBasic()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/wasteland-basic", expectedErrors, expectedWarnings, "valid/wasteland-basic.txt");
  }

  @Test
  public void testValidateEPUBLoremAudio()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.OPF_056, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-audio", expectedErrors, expectedWarnings, "valid/lorem-audio.txt");
  }

  @Test
  public void testValidateEPUBLoremxhtmlrng1()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-xhtml-rng-1", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBLoremxhtmlsch1()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-xhtml-sch-1", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremBasicMathml()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_014);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-basic-switch", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremMimetype()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.PKG_007, MessageId.PKG_007);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-mimetype", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremMimetype2()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.PKG_007, MessageId.PKG_007);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-mimetype-2", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremBasicSwitch()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-basic-switch", expectedErrors, expectedWarnings, "valid/lorem-basic-switch.txt");
  }

  @Test
  public void testValidateEPUBPLoremLink()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-link", expectedErrors, expectedWarnings, "valid/lorem-link.txt");
  }

  @Test
  public void testValidateEPUBPLoremForeign()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-foreign", expectedErrors, expectedWarnings, "valid/lorem-foreign.txt");
  }

  @Test
  public void testValidateEPUBPLoremObjectFallbacks()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-object-fallbacks", expectedErrors, expectedWarnings, "valid/lorem-object-fallbacks.txt");
  }

  @Test
  public void testValidateEPUBPLoremBindings()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-bindings", expectedErrors, expectedWarnings, "valid/lorem-bindings.txt");
  }

  @Test
  public void testValidateEPUBPLoremInvalidBindings()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.MED_002);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-bindings", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremPoster()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-poster", expectedErrors, expectedWarnings, "valid/lorem-poster.txt");
  }

  @Test
  public void testValidateEPUBPLoremSvg()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-svg", expectedErrors, expectedWarnings, "valid/lorem-svg.txt");
  }

  @Test
  public void testValidateEPUBPLoremImage()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-image", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPLoremSvgHyperlink()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
      testValidateDocument("valid/lorem-svg-hyperlink", expectedErrors, expectedWarnings, "valid/lorem-svg-hyperlink.txt");
  }

  @Test
  public void testValidateEPUBPInvalidLoremPoster()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.MED_001);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-poster", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUBPInvalidLoremForeign()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_014);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-foreign", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_navInvalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    testValidateDocument("invalid/nav-invalid/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_issue134_1()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    // svg in both contentdocs, opf props set right
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.ACC_013);
    testValidateDocument("valid/lorem-svg-dual/", expectedErrors, expectedWarnings, "valid/lorem-svg-dual.txt");
  }

  @Test
  public void testValidateEPUB30_issue134_2()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_014, MessageId.OPF_014);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    // svg in both contentdocs, no opf props set right
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-svg-dual/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_issue134_3()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_014);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    // svg in both contentdocs, only one opf prop set right
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-svg-dual-2/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSImport_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-css-import/", expectedErrors, expectedWarnings, "valid/lorem-css-import.txt");
  }

  @Test
  public void testValidateEPUB30_CSSImport_invalid_1()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_001, MessageId.RSC_001);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-css-import-1/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSImport_invalid_2()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_008);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.OPF_003);
    testValidateDocument("invalid/lorem-css-import-2/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSURLS_1()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_007);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014, MessageId.ACC_014);
    //'imgs/table_header_bg_uni.jpg': referenced resource missing in the package
    testValidateDocument("invalid/lorem-css-urls-1/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSURLS_2()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_027);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //'imgs/table_header_bg_uni.jpg': referenced resource missing in the package
    testValidateDocument("invalid/lorem-css-urls-2/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSURLS_3()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.ACC_014, MessageId.CSS_017, MessageId.ACC_014);
    //'imgs/table_header_bg_uni.jpg': referenced resource missing in the package
    testValidateDocument("invalid/lorem-css-urls-3/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSFontFace_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/wasteland-otf/", expectedErrors, expectedWarnings, "valid/wasteland-otf.txt");
  }

  @Test
  public void testValidateEPUB30_CSSFontFace_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_001, MessageId.RSC_001, MessageId.RSC_001);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.CSS_022, MessageId.CSS_022);
    //referenced fonts missing
    testValidateDocument("invalid/wasteland-otf/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_CSSEncoding_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.CSS_003);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //@charset not utf
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-css-enc/", expectedErrors, expectedWarnings);
  }

  @Test
	public void testValidateEPUB30_CSSMediaType_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();

    Collections.addAll(expectedWarnings,MessageId.CSS_010);
    //CSS with declared type 'xhtml/css' should raise a "no fallback" error
		testValidateDocument("invalid/lorem-css-wrongtype/", expectedErrors, expectedWarnings);
	}
	@Test
  public void testValidateEPUB30_remoteAudio_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
	

    // audio element with @src attribute
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-remote/", expectedErrors, expectedWarnings, "valid/lorem-remote.txt");
  }

  @Test
	public void testValidateEPUB30_remoteHttpsAudio_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();

    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    // remote audio element via HTTPS
		testValidateDocument("valid/lorem-remote-https/", expectedErrors, expectedWarnings);
	}
	
	@Test
	public void testValidateEPUB30_remoteUrlWithQuery_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();

    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    // remote audio element via HTTPS
		testValidateDocument("valid/lorem-remote-queryurl/", expectedErrors, expectedWarnings);
	}

	@Test
  public void testValidateEPUB30_remoteAudioSources_valid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();

    // audio element with sources children
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-remote-2/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_remoteImg_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_006, MessageId.OPF_010);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //remote resource of invalid type (img) declared in opf
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-remote/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_remoteImg_invalid2()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_014);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //remote audio, declared in opf, but missing 'remote-resources' property
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-remote-2/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_remoteAudio_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.MED_002, MessageId.RSC_008);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //remote audio, not declared in the manifest
    // we should only get one error here:
    // the "no fallback" error is extra since no type info
    // can be retrieved from the manifest...
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-remote-3/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_remoteAudioSources_invalid()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.MED_002, MessageId.RSC_008, MessageId.RSC_008);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //audio element with a list of source children pointing to remote resources
    // not declared in the manifest
    // we should only get two errors here:
    // the "no fallback" error is extra since no type info
    // can be retrieved from the manifest...
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-remote-4/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_circularFallback()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.OPF_045, MessageId.OPF_045, MessageId.OPF_045, MessageId.OPF_045, MessageId.MED_003);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/fallbacks-circular/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_nonresolvingFallback()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005, MessageId.OPF_040, MessageId.MED_003);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //dupe messages, tbf
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/fallbacks-nonresolving/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_okFallback()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/fallbacks/", expectedErrors, expectedWarnings, "valid/fallbacks.txt");
  }

  @Test
  public void testValidateEPUB30_svgCoverImage()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/svg-cover/", expectedErrors, expectedWarnings, "valid/svg-cover.txt");
  }

  @Test
  public void testValidateEPUB30_svgInSpine()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.MED_006, MessageId.MED_006, MessageId.MED_006);
    //svg in spine, svg cover image
    testValidateDocument("valid/svg-in-spine/", expectedErrors, expectedWarnings, "valid/svg-in-spine.txt");
  }

  @Test
  public void testValidateEPUB30_videoAudioTrigger()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_033, MessageId.HTM_033, MessageId.HTM_033, MessageId.ACC_003, MessageId.HTM_033, MessageId.ACC_003, MessageId.HTM_033, MessageId.ACC_003, MessageId.HTM_033, MessageId.ACC_003, MessageId.HTM_033, MessageId.ACC_003, MessageId.HTM_033, MessageId.ACC_003, MessageId.ACC_013, MessageId.ACC_013, MessageId.ACC_013, MessageId.ACC_013);
    testValidateDocument("valid/cc-shared-culture/", expectedErrors, expectedWarnings, "valid/cc-shared-culture.txt");
  }

  @Test
  public void testValidateEPUB30_InvalidLinks()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_007, MessageId.RSC_012, MessageId.RSC_012, MessageId.RSC_012);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_027, MessageId.CSS_022, MessageId.CSS_022, MessageId.CSS_022, MessageId.CSS_022, MessageId.ACC_013, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005, MessageId.ACC_005);

    /*
       * the valid counterpart is in the zipped section
       *
       * - one broken file ref in navdoc
       * - one broken frag ref in navdoc
       * - one broken internal frag ref in overview
       * - one broken crossdoc frag ref in overview
       */

    testValidateDocument("invalid/epub30-spec/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_basicDual()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/lorem-basic-dual/", expectedErrors, expectedWarnings, "valid/lorem-basic-dual.txt");
  }

  @Test
  public void testValidateEPUB30_Base()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_006, MessageId.RSC_006);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //<base href set, see issue 155
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-basic-dual-base/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_InvalidContainer()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-container/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_InvalidSignatures()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/lorem-signatures/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_InvalidEncryption()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.OPF_003, MessageId.PKG_010);
    testValidateDocument("invalid/lorem-encryption/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testValidateEPUB30_customNsAttr()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/custom-ns-attr/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue188()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //Image file name containing '+'
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue188/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue189()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    Collections.addAll(expectedErrors, MessageId.RSC_005);
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //element "somebadxhtmlformatting" not allowed here
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("invalid/issue189/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue198()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    //Collections.addAll(expectedErrors, );

    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //also data-* removal
    testValidateDocument("valid/issue198/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue211a()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //figcaption and scoped styles alt 1
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue211a/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue211b()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //figcaption and scoped styles alt 2
    Collections.addAll(expectedWarnings, MessageId.ACC_003, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue211b/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue225()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    //2 @href values 0-length and empty after ws norm
    //issue225 asked for warning here, but we give none
    //until we have a compat hint message type; the empty
    //string is a valid URI
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue225/", expectedErrors, expectedWarnings);
  }

  @Test
  public void testIssue226()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue226/", expectedErrors, expectedWarnings);
  }
	
	@Test
	public void testIssue237() {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    // namespace uri in css is not a remote resource...
		testValidateDocument("valid/issue237/", expectedErrors, expectedWarnings);
	}
	
	@Test
	public void testIssue249() {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022, MessageId.OPF_018);
		testValidateDocument("valid/issue249/", expectedErrors, expectedWarnings);
	}

	@Test
	public void testValidateEPUB20_issue267() {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue267/", expectedErrors, expectedWarnings, "valid/issue267.txt");
	}
	
	@Test
	public void testIssue270() {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.CSS_022, MessageId.CSS_022);
    testValidateDocument("valid/issue270/", expectedErrors, expectedWarnings);
	}
	
  @Test
  public void testXHTMExtension()
  {
    List<MessageId> expectedErrors = new ArrayList<MessageId>();
    List<MessageId> expectedWarnings = new ArrayList<MessageId>();
    List<MessageId> expectedFatals = new ArrayList<MessageId>();
    Collections.addAll(expectedWarnings, MessageId.HTM_014a);
    testValidateDocument("invalid/xhtml-extension", expectedErrors, expectedWarnings, expectedFatals, true);
  }

}
