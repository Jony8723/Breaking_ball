package fr.jonybegood.breakingball;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.jonybegood.breakingball.entities.BreakoutView;
import fr.jonybegood.breakingball.entities.Game;
import fr.jonybegood.breakingball.entities.TetrixView;
import fr.jonybegood.breakingball.tools.BooleanWrapper;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameFragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Game game;
    private BooleanWrapper runningThread;
    private TextView tvGameInfo,tvScore,tvHighscore;

    public GameFragment2() {
        // Required empty public constructor
    }

    public GameFragment2(Game game, TextView tvGameInfo, TextView tvScore,TextView tvHighscore,BooleanWrapper runningThread) {
        // Required empty public constructor
        this.game=game;
        this.tvGameInfo = tvGameInfo;
        this.tvScore = tvScore;
        this.tvHighscore=tvHighscore;
        this.runningThread = runningThread;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GameFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GameFragment newInstance(String param1, String param2) {
        GameFragment fragment = new GameFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TetrixView tetrixView = new TetrixView(getContext(),game,tvGameInfo,tvScore,tvHighscore,runningThread);
        // Inflate the layout for this fragment
        return tetrixView;
    }
}