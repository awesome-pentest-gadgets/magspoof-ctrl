/*
 * Magspoof Controller - An app to control a Magspoof
 *     Copyright (C) 2016  Ben Goldberg
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.zethratech.magspoofcontroller.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zethratech.magspoofcontroller.R;
import com.zethratech.magspoofcontroller.services.MagspoofService;
import com.zethratech.magspoofcontroller.services.MagspoofServiceImpl;

import org.shokai.firmata.ArduinoFirmata;

public class MainActivity extends AppCompatActivity {


    private String TAG = "MagspoofController - MainActivity";
    private MagspoofService magspoofService = new MagspoofServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Firmata Lib Version : " + magspoofService.getFirmataVersion());
    }
}
