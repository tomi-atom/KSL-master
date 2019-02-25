package atomstudio.ksl.network;

import atomstudio.ksl.response.ResponseBerita;
import atomstudio.ksl.response.ResponseUser;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rizal Hilman on 12/02/18.
 * www.khilman.com
 */

public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("posts.php")
    Call<ResponseBerita> request_show_all_berita();
    // <ModelData> nama_method()
    @GET("loginregister.php")
    Call<ResponseUser> request_user();

}
