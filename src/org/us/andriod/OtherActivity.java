/*
 Optics demo package
 Copyright (C) 2011 Audrius Meskauskas

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.

 Developed 27 November 2011 by Audrius Meskauskas
*/

package org.us.andriod;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Prism demo application.
 */
public class OtherActivity extends Activity {  

	TextView mText; 
	Rays rayCanvas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.other);
		mText = (TextView) findViewById(R.id.text);
		
		Reflection demo = (Reflection)
			getIntent().getSerializableExtra(An_StartActivity.DEMOKEY);
		if (demo == null)
			demo = Reflection.CONVERGING_LENS;
		
		mText.setText(getResources().getStringArray(R.array.demos)[demo.ordinal()]);
		rayCanvas = (Rays) findViewById(R.id.rayCanvas);
		rayCanvas.setState(demo);
	}
}