package org.evolvedigital.affirmations.data

import org.evolvedigital.affirmations.R.drawable.*
import org.evolvedigital.affirmations.R.string.*
import org.evolvedigital.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(affirmation1, image1),
            Affirmation(affirmation2, image2),
            Affirmation(affirmation3, image3),
            Affirmation(affirmation4, image4),
            Affirmation(affirmation5, image5),
            Affirmation(affirmation6, image6),
            Affirmation(affirmation7, image7),
            Affirmation(affirmation8, image8),
            Affirmation(affirmation9, image9),
            Affirmation(affirmation10, image10)
        )
    }
}