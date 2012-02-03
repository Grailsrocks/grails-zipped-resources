/**
 * Development-mode only bootstrap
 */

class BootStrap {
 
    def resourceService
    
    def init = { servletContext ->
        
        resourceService.with {
            module 'test', [
                'css/default.css',
                'css/default2.css',
                'js/prototype.js',
                'js/effects.js'
            ]
        }
    }
    
    def destroy = {
        
    }
}