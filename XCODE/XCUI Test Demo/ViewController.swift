//
//  ViewController.swift
//  XCUI Test Demo
//
//  Created by Julian Wyatt on 19/08/2020.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var NameInput: UITextField!
    @IBOutlet weak var submitBtn: UIButton!
    @IBOutlet weak var EnterNameText: UILabel!
    @IBOutlet weak var HelloMessage: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        for family: String in UIFont.familyNames
        {
            print(family)
            for names: String in UIFont.fontNames(forFamilyName: family)
            {
                print("== \(names)")
            }
        }
    }


    @IBAction func SubmitEvent(_ sender: Any) {
        if (NameInput.text != ""){
    //        Disable Interactable elements
            
            submitBtn.isUserInteractionEnabled = false
            submitBtn.alpha = 0
            
            NameInput.isUserInteractionEnabled = false
            NameInput.alpha = 0
            
    //        Edit welcome message
            
            EnterNameText.text = "Welcome to the XCUI demo"
            HelloMessage.text = "Hello \(NameInput.text!),"
        }
        
        else{
            EnterNameText.text = "I'm sorry, you left your name blank"
        }
        
    }
}

