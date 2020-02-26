export class User{
    constructor(
       public username: string,
       public email: string,
       public phone: string,
       public interest: string,
       public gender: string,
       public remember: boolean
    ){}
}