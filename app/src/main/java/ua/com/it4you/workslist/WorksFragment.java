package ua.com.it4you.workslist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class WorksFragment extends ListFragment {

    String testData[] = new String[]{"test item 1", "test item 2", "test item 3"};

    public WorksFragment() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> testDataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, testData);

        setListAdapter(testDataAdapter);

    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_works, container, false);
//    }
}
