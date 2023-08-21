package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        tags = "@deneme",
        dryRun = false
        /*
        Eger ki featureslarda bizim eksik yani daha once tanimlanmamis (sari sekilde gozukmesi) scenriolari belirlemek icin
        eksik adim olup olmadigini dryRun`i TRUE yaparak kontrol etmis oluruz.

        Eger ki testlerimiz passed olursa bu testlerimizin basarili oldugunu degil eksik adimlarin olmadigi
        yani testlerimizin kosturmaya hazir oldugu anlamina gelmektedir.

        Eger ki eksik adimimiz yok iste tum islemeleri tamamladigimizda TESTLERIMI KOSTURMAK ICIN DRYRUN`i FALSE yaparim.
         */
)

public class Runner {
}
