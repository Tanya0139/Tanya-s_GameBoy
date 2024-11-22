//
//  ContentView.swift
//  L3 Demo
//
//  Created by Tanya Tripathi on 20/12/23.
//

import SwiftUI

struct ContentView: View {
    
    @State var playerCard = "card7"
    @State var cpuCard = "card13"
    @State var playerScore = 0
    @State var cpuScore = 0
    
    
    var body: some View {
        
        ZStack{
            Image("background-plain")
                .resizable()
                .ignoresSafeArea()
            
            VStack{
                Spacer()
                Image("logo")
                    
                Spacer()
                
                HStack{
                    Spacer()
                    Image(playerCard)
                    Spacer()
                    Image(cpuCard)
                    Spacer()
                } //card images
                
                Spacer()
                
                Button(action: {deal()}, label: {
                    Image("button")
                })
                
                
                Spacer()
                
                HStack{
                    Spacer()
                    VStack{
                        Text("Player")
                            .font(.headline)
                            .padding(.bottom, 10.0)
                        Text(String(playerScore))
                            .font(.largeTitle)
                            
                    }
                    Spacer()
                    VStack{
                        Text("CPU")
                            .font(.headline)
                            .padding(.bottom, 10.0)
                        Text(String(cpuScore))
                            .font(.largeTitle)
                            
                    }
                    Spacer()
                }.foregroundColor(Color.white) 
                //score
                Spacer()
            }
            
        }
    }
    
    func deal(){
        // randomise the players cards
        let playerCardValue = Int.random(in: 2...14)
        let cpuCardValue = Int.random(in: 2...14)
        playerCard = "card" + String(playerCardValue)
        
        // randomise the cpus cards
        
        cpuCard = "card" + String(cpuCardValue)
        
        // update the scores
        if playerCardValue > cpuCardValue{
            playerScore += 1
        }
        else{
            cpuScore += 1
        }
    }
}

#Preview {
    ContentView()
}
