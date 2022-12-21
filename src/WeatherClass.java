import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;

public class WeatherClass
{
    public static void main(String[] args)
    {
        // Replace YOUR_API_KEY with your actual API key
        String apiKey = "C";

        try
        {
            // Make a request to the Accuweather API for the current weather in Antarctica
            URL url = new URL(
                    "http://dataservice.accuweather.com/currentconditions/v1/50?apikey=" + apiKey
            );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Check the status code of the response
            if (conn.getResponseCode() == 200)
            {
                // If the request was successful, read the response and parse the JSON data using Gson
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
                Gson gson = new Gson();
                Weather weather = gson.fromJson(result.toString(), Weather.class);
                System.out.println(
                        "Current temperature in Antarctica: " +
                                weather.Temperature.Metric.Value +
                                "°C"
                );
            }
            else
            {
                // If the request was not successful, print an error message
                System.out.println("Error getting weather data");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Weather
{
    Temperature Temperature;
}

class Temperature
{
    Metric Metric;
}

class Metric
{
    int Value;
}
