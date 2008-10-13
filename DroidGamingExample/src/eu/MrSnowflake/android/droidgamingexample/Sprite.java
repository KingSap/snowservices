/* GameActivityExample - This is an example for DroidGaming.
 * Copyright (C) 2008  Maarten 'MrSnowflake' Krijn
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package eu.MrSnowflake.android.droidgamingexample;

import android.graphics.Bitmap;

public class Sprite {
	public Sprite(Bitmap bmp) {
		mBitmap = bmp;
		x = 0;
		y = 0;
	}
	
	public float x;
	public float y;
	public Bitmap mBitmap;
}
