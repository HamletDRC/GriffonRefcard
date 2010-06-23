class ClickerController {

    def model
    def counterService
	
    def action = { 
        int value = counterService.getNext()
        model.message = "Count: $value"
    }
}
