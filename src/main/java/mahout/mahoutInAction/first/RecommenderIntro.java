package mahout.mahoutInAction.first;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

/**
 * Created by ZhangGe on 12/25/2015.
 */
public class RecommenderIntro {
    public static void main(String[] args) throws Exception {
        DataModel model = new FileDataModel(new File("D:\\Java\\IDEA\\git\\backend\\groovy\\target\\classes\\mahout\\mahoutInAction\\first\\intro.csv")); //A
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity); //B
        List<RecommendedItem > recommendations = recommender.recommend(1, 3); //C
        for (RecommendedItem recommendation : recommendations) {
            System.out.println(recommendation);
        }
    }
}
