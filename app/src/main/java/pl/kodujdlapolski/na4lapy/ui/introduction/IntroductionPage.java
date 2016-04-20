package pl.kodujdlapolski.na4lapy.ui.introduction;

import java.io.Serializable;

/**
 * Created by Natalia Wróblewska on 2016-04-20.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class IntroductionPage implements Serializable {
    private final String text;
    private final int layout;
    private final int bgColor;

    public IntroductionPage(String text, int layout, int bgColor) {

        this.text = text;
        this.layout = layout;
        this.bgColor = bgColor;
    }

    public String getText() {
        return text;
    }

    public int getLayout() {
        return layout;
    }

    public int getBgColor() {
        return bgColor;
    }
}
