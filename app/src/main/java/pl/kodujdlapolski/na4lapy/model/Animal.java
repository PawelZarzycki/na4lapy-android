/*
 *	Copyright 2017 Stowarzyszenie Na4Łapy
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package pl.kodujdlapolski.na4lapy.model;

import org.joda.time.LocalDate;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import pl.kodujdlapolski.na4lapy.model.type.ActivityAnimal;
import pl.kodujdlapolski.na4lapy.model.type.Gender;
import pl.kodujdlapolski.na4lapy.model.type.Size;
import pl.kodujdlapolski.na4lapy.model.type.Species;
import pl.kodujdlapolski.na4lapy.model.type.Sterilization;
import pl.kodujdlapolski.na4lapy.model.type.Training;
import pl.kodujdlapolski.na4lapy.model.type.Vaccination;

@Getter
@Setter
public class Animal implements Serializable {

    private Long id;
    private Shelter shelter;
    private String name;
    private String race;
    private String description;
    private String chipId;
    private LocalDate birthDate;
    private LocalDate admittanceDate;
    private Sterilization sterilization;
    private Species species;
    private Gender gender;
    private Size size;
    private ActivityAnimal activity;
    private Vaccination vaccination;
    private Training training;

    private ArrayList<Photo> photos;

    private Boolean favourite;

    public String getProfilePicUrl() {
        if (getPhotos() == null) return null;
        Photo p = null;
        for (Photo candidatePhoto : getPhotos()) {
            if (candidatePhoto.getProfil()) {
                p = candidatePhoto;
            }
        }
        if (p == null && !getPhotos().isEmpty()) {
            p = getPhotos().iterator().next();
        }
        if (p == null) return null;
        return p.getFullFileName();
    }
}
