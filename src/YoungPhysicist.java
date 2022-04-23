public class YoungPhysicist {

        public boolean isEquilibrium(int numOfVectors, int [][]vector)  {
            if (vector.length!=numOfVectors) {
                throw new IllegalArgumentException("the first num should fit the number of vectors entered");
            }
                int Forces_sum=0;
        if ( numOfVectors<1 || numOfVectors>100) {
            return false;
        }

        for (int i=0; i<numOfVectors; i++) {
            for (int j = 0; j < 3; j++) {
                if (vector[i][j] < -100 || vector[i][j] > 100){
                    return false;
                }
            }
        }
        for (int j=0; j<3; j++) {
            for (int k = 0; k < numOfVectors; k++){
                Forces_sum = Forces_sum + vector[k][j];
            }
            if (Forces_sum != 0) {
                return false;
            }
        }
        return true;
    }
    }



