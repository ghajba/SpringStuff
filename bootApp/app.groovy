@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "A Groovy kind of World :)"
    }

}

