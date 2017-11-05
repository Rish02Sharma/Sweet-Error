package therajanmaurya.opensource.sweeterror;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author Rajan Maurya
 *         On 04/11/17.
 */
public class SweetBaseFragment extends Fragment {

    private SweetUIErrorHandler sweetUIErrorHandler;

    public void initializeSweetUIErrorHandler(Context context, View view) {
        sweetUIErrorHandler = new SweetUIErrorHandler(context, view);
    }

    public void showJusticeEmptyUI(@NonNull String featureName, @Nullable String subFeatureName,
            @NonNull Integer featureImage) {
        sweetUIErrorHandler.showSweetErrorUI(SweetErrorType.EMPTY_UI, featureName,
                subFeatureName, featureImage);
    }

    public void showJusticeErrorUI(@NonNull String featureName) {
        sweetUIErrorHandler.showSweetErrorUI(SweetErrorType.ERROR_UI, featureName, null,
                null);
    }

    public void showJusticeNoInternetUI() {
        sweetUIErrorHandler.showSweetErrorUI(SweetErrorType.NO_INTERNET, null, null,
                null);
    }

    public void showCustomErrorUI(@NonNull String featureName, @Nullable String subFeatureName,
            @NonNull Integer featureImage) {
        sweetUIErrorHandler.showSweetErrorUI(SweetErrorType.CUSTOM, featureName,
                subFeatureName, featureImage);
    }
}
