package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList= arrayListOf<ExerciseModel>()
        val mountainClimber=ExerciseModel(
            1,
            "Mountain Climber",
            R.drawable.mountain_climber,
            isCompleted = false,
            isSelected = false
        )
       exerciseList.add(mountainClimber)
        val abdominalCrunches=ExerciseModel(2,"Abdominal Crunches",R.drawable.abdominal_crunches,false,false)
        exerciseList.add(abdominalCrunches)

        val tricepsDips=ExerciseModel(3,"Triceps Dips",R.drawable.triceps_dips,false,false)
        exerciseList.add(tricepsDips)

        val bicycleCrunches=ExerciseModel(4,"Bicycle Crunches",R.drawable.exersice_4,false,false)
        exerciseList.add(bicycleCrunches)

        val legRaises=ExerciseModel(5,"Leg Raises",R.drawable.exersice_5,false,false)
        exerciseList.add(legRaises)

        val heelTouch=ExerciseModel(6,"Heel Touch",R.drawable.exersice_6,false,false)
        exerciseList.add(heelTouch)

        val reverseCrunches=ExerciseModel(7,"Reverse Crunches",R.drawable.exersice_7,false,false)
        exerciseList.add(reverseCrunches)


        val reclinedObliqueTwist=ExerciseModel(8,"Reclined Oblique Twist",R.drawable.exersice_9,false,false)
        exerciseList.add(reclinedObliqueTwist)

        val plankRaise=ExerciseModel(9,"Plank Raise",R.drawable.exersice_11,false,false)
        exerciseList.add(plankRaise)

        val russianTwist=ExerciseModel(10,"Russian Twist",R.drawable.exersice_12,false,false)
        exerciseList.add(russianTwist)

        val buttBridge=ExerciseModel(11,"Butt Bridge",R.drawable.exersice_13,false,false)
        exerciseList.add(buttBridge)


        val jumpingJacks=ExerciseModel(12,"Jumping Jacks",R.drawable.exercise16,false,false)
        exerciseList.add(jumpingJacks)


       return exerciseList
    }
}