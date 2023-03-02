import React from 'react'
import CartSummary from './CartSummary'
import { Button, Container,  Menu } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            <Menu inverted fixed>
                <Container>
                    <Menu.Item
                        name='home'
                    /*active={activeItem === 'home'}
                    onClick={this.handleItemClick}*/
                    />
                    <Menu.Item
                        name='messages'
                    /*active={activeItem === 'messages'}
                    onClick={this.handleItemClick}*/
                    />

                    <Menu.Menu position='right'>
                        <CartSummary> </CartSummary>


                        <Menu.Item>
                            <Button primary>Sign Up</Button>
                        </Menu.Item>
                    </Menu.Menu>
                </Container>

            </Menu>


        </div >
    )
}
