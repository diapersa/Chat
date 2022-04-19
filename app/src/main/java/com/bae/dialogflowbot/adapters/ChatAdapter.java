package com.bae.dialogflowbot.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bae.dialogflowbot.R;
import com.bae.dialogflowbot.models.CustomPayload;
import com.bae.dialogflowbot.models.Message;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private List<Message> messageList;
    private Activity activity;

    public ChatAdapter(List<Message> messageList, Activity activity) {
        this.messageList = messageList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.adapter_message_one, parent, false);
        return new MyViewHolder(view);
    }

    private void addButton(String buttonText, MyViewHolder holder) {
        Button richButton = new Button(holder.itemView.getContext());
        richButton.setText(buttonText);
        holder.richContentLayout.addView(richButton);
    }

    String buttonText;
    String richContentLayout;

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String message = messageList.get(position).getMessage();

        boolean isReceived = messageList.get(position).getIsReceived();
        if (isReceived) {
            holder.messageReceive.setVisibility(View.VISIBLE);
            holder.messageSend.setVisibility(View.GONE);
            holder.messageReceive.setText(message);
            /*for (int i = 1; i <= 2; i++) {
                addButton(richContentLayout, holder);
            }*/
            //Aici adaugam cu addButton() in layout butoane cu textul din custom payload
        } else {
            holder.messageSend.setVisibility(View.VISIBLE);
            holder.messageReceive.setVisibility(View.GONE);
            holder.messageSend.setText(message);
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView messageSend;
        TextView messageReceive;
        LinearLayout richContentLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            messageSend = itemView.findViewById(R.id.message_send);
            messageReceive = itemView.findViewById(R.id.message_receive);
            richContentLayout = itemView.findViewById(R.id.rich_content_layout);
        }
    }
}