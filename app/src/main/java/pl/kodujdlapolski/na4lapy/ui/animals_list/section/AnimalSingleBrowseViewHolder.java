package pl.kodujdlapolski.na4lapy.ui.animals_list.section;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import pl.kodujdlapolski.na4lapy.R;
import pl.kodujdlapolski.na4lapy.model.Animal;
import pl.kodujdlapolski.na4lapy.model.type.ActivityAnimal;
import pl.kodujdlapolski.na4lapy.model.type.Gender;

/**
 * Created by Natalia on 2016-03-22.
 */

public class AnimalSingleBrowseViewHolder extends AnimalViewHolder {

    @Bind(R.id.add_to_fav_fab)
    FloatingActionButton addToFavFab;
    @Bind(R.id.animal_size_image)
    ImageView sizeImage;
    @Bind(R.id.animal_gender_image)
    ImageView genderImage;
    @Bind(R.id.animal_activity_image)
    ImageView activityImage;

    public AnimalSingleBrowseViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void init(Animal animal) {
        super.init(animal);
        addToFavFab.setImageResource(animal.isFavourite() ? R.drawable.ic_favorite_white : R.drawable.ic_favorite_border_white);
        addToFavFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo on animal or add
            }
        });
        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo on animal click
            }
        });

        switch (animal.getSize()) {
            case SMALL:
                sizeImage.setImageResource(R.drawable.vector_drawable_przegladanie_maly);
                break;
            case MEDIUM:
                sizeImage.setImageResource(R.drawable.vector_drawable_przegladanie_sredni);
                break;
            case LARGE:
                sizeImage.setImageResource(R.drawable.vector_drawable_przegladanie_duzy);
                break;
        }
        activityImage.setImageResource(animal.getActivity() == ActivityAnimal.HIGH ? R.drawable.vector_drawable_przegladanie_aktywny : R.drawable.vector_drawable_przegladanie_domator);
        genderImage.setImageResource(animal.getGender() == Gender.FEMALE ? R.drawable.vector_drawable_przegladanie_suczka : R.drawable.vector_drawable_przegladanie_samiec);
    }
}
