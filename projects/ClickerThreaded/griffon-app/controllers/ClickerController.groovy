class ClickerController {

    def model
    def counterService
	
    def action = { 
        model.busy = true
        doOutside {
            try {
                int value = counterService.next
                model.message = "Count: $value"
            } finally {
                edt {
                    model.busy = false
                }
            }
        }
    }
}
