package pl.kodujdlapolski.na4lapy.ui.browse;

import android.app.Activity;

import java.util.List;

import pl.kodujdlapolski.na4lapy.model.Animal;
import pl.kodujdlapolski.na4lapy.service.user.UserService;
import pl.kodujdlapolski.na4lapy.ui.DataSynchronization;

/**
 * Created by Natalia Wróblewska on 2016-05-22.
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
public interface BrowseContract {

    interface View extends DataSynchronization {

        Adapter getAdapter();

        Activity getActivity();
    }

    interface Presenter extends OnBrowseElementClickedAction {

        List<Animal> getAnimals();

        void onChangedAnimalAvailable(Long changedAnimalId);

        void handleUndoAnimal(Animal animalToUndo);

        UserService getUserService();
    }

    interface Adapter {

        void notifyItemChanged(Animal animal);

        void notifyItemRemoved(Animal animal);

        void notifyDataSetChanged();
    }

}
