/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        int i = 1;
        final double MAX = 700;
        final double MIN = 0;
        double random;
        do {
            random = RND.nextDouble() * (MAX - MIN) + MIN;
            System.out.printf("Estación %d ...: %.02f", i, random);
            System.out.println(" mcg NO2");

            i++;
        } while (i < 5);
    }

}
