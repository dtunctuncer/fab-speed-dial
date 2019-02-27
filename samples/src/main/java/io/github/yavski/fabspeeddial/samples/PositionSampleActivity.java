/*
 * Copyright 2016 Yavor Ivanov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.yavski.fabspeeddial.samples;

import android.os.Bundle;
import android.support.design.internal.NavigationMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import io.github.yavski.fabmenu.samples.R;
import io.github.yavski.fabspeeddial.FabSpeedDial;

public class PositionSampleActivity extends BaseSampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position_sample);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        FabSpeedDial fabSpeedDial = findViewById(R.id.position_bottom_end);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.test)
                    Toast.makeText(PositionSampleActivity.this, "test", Toast.LENGTH_SHORT).show();


                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });

        fabSpeedDial.addMenuItem(0, R.id.test, 3, "test", R.drawable.ic_mail_outline_white_24px);
        setSupportActionBar(toolbar);
    }

}
