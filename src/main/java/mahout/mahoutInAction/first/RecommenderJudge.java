package mahout.mahoutInAction.first;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.common.RandomUtils;

import java.io.File;

/**
 * Created by ZhangGe on 12/25/2015.
 */
public class RecommenderJudge {

    public static void main(String[] args) throws Exception {
        RandomUtils.useTestSeed(); // the same random choices each time
        DataModel model = new FileDataModel(new File("src/main/java/mahout/mahoutInAction/first/intro.csv"));

        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();// new RMSRecommenderEvaluator();

        // Build the same recommender for testing that we did last time:
        RecommenderBuilder recommenderBuilder = new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel model) throws TasteException {
                UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
                UserNeighborhood neighborhood =
                        new NearestNUserNeighborhood(2, similarity, model);
                return new GenericUserBasedRecommender(model, neighborhood, similarity);
            }
        };
        // Use 70% of the data to train; test using the other 30%.
        double score = evaluator.evaluate(recommenderBuilder, null, model, 0.7, 1.0);  // 1.0 how much of the overall input data is used.
        System.out.println(score);
    }

}
