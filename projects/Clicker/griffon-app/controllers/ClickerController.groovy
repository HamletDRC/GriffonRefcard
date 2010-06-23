class ClickerController {

    def model
    def counter = 0
	
    def action = { 
        model.message = "Count: ${counter++}"
    }
}
