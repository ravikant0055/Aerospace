package Adapterss;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aerospace.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

import Models.DroneModel;
import de.hdodenhof.circleimageview.CircleImageView;

public class DroneAdapter extends RecyclerView.Adapter<DroneAdapter.viewHolder> {

    ArrayList<DroneModel> list;
    Context context;

    public DroneAdapter(ArrayList<DroneModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sampleviewpage, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolder holder, int position) {

        final DroneModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item is clicked", Toast.LENGTH_SHORT).show();

                BottomSheetDialog bottomSheetDialog =new BottomSheetDialog(context,R.style.BottomSheetDialogTheme);

                View bottomSheetView =((FragmentActivity)context).getLayoutInflater()
                        .inflate(R.layout.layout_bottom_sheet,(LinearLayout)bottomSheetDialog.findViewById(R.id.layout_bottom_sheet_container));
                TextView name =bottomSheetView.findViewById(R.id.name);
                TextView dimension =bottomSheetView.findViewById(R.id.dimen);
                TextView weight =bottomSheetView.findViewById(R.id.weight);
                ImageView Iv =bottomSheetView.findViewById(R.id.droneIv);
                Iv.setImageResource(model.getPic());
                name.setText(model.getText());
                dimension.setText(model.getDimen());
                weight.setText(model.getWeight());






                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size(); //recyclerview size is depend on the list of item
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
